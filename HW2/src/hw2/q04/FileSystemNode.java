package hw2.q04;

import java.util.ArrayList;
import java.util.List;

public class FileSystemNode
{

        public String data;
        public List<FileSystemNode> children= new ArrayList<>();
        
        public FileSystemNode(String data,List<FileSystemNode> children)
        {
            this.children=children;
            this.data=data;
            
        }
	public FileSystemNode(String data)
	{
            this.data=data;
	}

	public FileSystemNode()
	{
	}

	private int getSize()
        {
            int size=0;
            for(int i=0;i<this.children.size();i++)
            {
                if(this.children.get(i).data.equals("size"))
                {
                    String temp = this.children.get(i).children.get(0).data;
                    size        = Integer.parseInt(temp);
                }
            }
            return size;
	}

	private int getDate()
	{
            int date=0;
            for(int i=0;i<children.size();i++)
            {
                if(children.get(i).data.equals("date"))
                {
                    date = Integer.parseInt(children.get(i).children.get(0).data);
                }
            }
            return date;
	}
        
	private String getName()
	{
            String name = "";
            for(int i=0;i<children.size();i++)
            {
                if(children.get(i).data.equals("name"))
                {
                    name = children.get(i).children.get(0).data;
                }
            }
            return name;
	}
        
	public List<String> getDirectories(List<String> newl)
	{
            if(data.equals("directory"))
            {
                newl.add(this.getName());
            }
            for(int i=0;i<children.size();i++)
            {
                children.get(i).getDirectories(newl);
            }
            return newl;
	}

	public List<String> getFiles(List<String> newl)
	{
            if(data.equals("file"))
            {
                newl.add(this.getName());
            }
            for(int i=0;i<children.size();i++)
            {
                children.get(i).getFiles(newl);
            }
            return newl;
	}

	public List<String> getFilesLargerThan(int size,List<String> newl)
	{
            if(this.getSize()>=size)
            {
                newl.add(this.getName());
            }            
            for(int i=0;i<children.size();i++)
            {
                children.get(i).getFilesLargerThan(size,newl);
            }
            return newl;
	}

	public List<String> getFilesNewerThan(int date,List<String> newl)
	{
            if(this.getDate()>=date)
            {
                newl.add(this.getName());
            }            
            for(int i=0;i<children.size();i++)
            {
                children.get(i).getFilesNewerThan(date,newl);
            }
            return newl;
	}

        public int getHeight()
        { 
            if (isLeaf()) return 1;
            int tallestChild = 0;
            for (int i=0; i<children.size(); i++)
            {
                if(children.get(i).data.equals("directory"))
                {
                    tallestChild = Math.max(tallestChild, children.get(i).getHeight());
                }
            }
            return tallestChild + 1;
        }
	  
	public int getNumberOfDirectories()
	{
            int count=0;
//            if(data.equals("directory"))
//            {
//                count++;
//            }
            for(int i=0;i<children.size();i++)
            {
                if(children.get(i).data.equals("directory"))
            {
                count++;
            }
                children.get(i).getNumberOfDirectories();
            }
            return count+1;
	}

	public int getNumberOfFiles()
	{
            int count=0;
//            if(data.equals("file"))
//            {
//                count++;
//            }
            for(int i=0;i<children.size();i++)
            {
                if(children.get(i).data.equals("file"))
            {
                count++;
            }
                children.get(i).getNumberOfFiles();
            }
            return count;
	}

	public int getNumberOfFilesLargerThan(int size, List<String> newl)
	{
            List<String> temp = this.getFilesLargerThan(size,newl);
            return temp.size();
	}

	public int getNumberOfFilesNewerThan(int date, List<String> newl)
	{
            List<String> temp = this.getFilesNewerThan(date,newl);
            return temp.size();
	}

	public int getNumberOfMovies(List<String> newl)
	{
            if(this.getName().endsWith(".mov") || this.getName().endsWith(".mpeg") || this.getName().endsWith(".avi"))
            {
                newl.add(this.getName());
            }
            for(int i=0;i<children.size();i++)
            {
                children.get(i).getNumberOfMovies(newl);
            }
            return newl.size();
	}

	public int getNumberOfMoviesNewerThan(int date, List<String> newl)
	{
            if(this.getDate()>=date && (this.getName().endsWith(".mov") || this.getName().endsWith(".mpeg") || this.getName().endsWith(".avi")))
            {
                newl.add(this.getName());
            }            
            for(int i=0;i<children.size();i++)
            {
                children.get(i).getNumberOfMoviesNewerThan(date,newl);
            }
            return newl.size();
	}

	public int getNumberOfPictures(List<String> newl)
	{
            if(this.getName().endsWith(".jpg") || this.getName().endsWith(".jpeg") || this.getName().endsWith(".png"))
            {
                newl.add(this.getName());
            }
            for(int i=0;i<children.size();i++)
            {
                children.get(i).getNumberOfPictures(newl);
            }
            return newl.size();
	}

	public void insertVirus(String fileName, String virusCode, int virusSize)
	{
            if(data.equals("file") && this.getName().equals(fileName))
            {
                FileSystemNode news;
                for(int i = 0; i < children.size(); i++) {
                    news = children.get(i);
                    if(news.data.equals("size"))
                    {
                        news.children.get(0).data = String.valueOf(virusSize);
                    }
                }
            }
            else
            {
                for(int i=0;i<children.size();i++)
                {
                    children.get(i).insertVirus(fileName, virusCode, virusSize);
                }
            }
	}

	public String getTreeStructure(int level)
	{
            String out="";
            int numberofspace=4*level;
            for(int i=0;i<numberofspace;i++)
            {
                out+=" ";   
            }
            out+="|-- ";
            out+=data;
            out+=System.lineSeparator();
            for(int i=0;i<children.size();i++)
            {
                out+=children.get(i).getTreeStructure(level+1);
            }
            return out;
	}

	public void rename(String oldName, String newName)
	{
            if(data.equals(oldName))
            {
                data = newName;
            } 
            for(int i=0;i<children.size();i++)
            {
                children.get(i).rename(oldName, newName);
            }
	}
        
        public boolean isLeaf()
        { 
            return children.isEmpty(); 
        }

}
