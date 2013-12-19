/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4.q02;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Jess
 */
public class Q02Test_hidden {
    
    
    @Test
    public void testIsFull(){        
        System.out.println("testIsFull");
        TreeAnalyzer instance = new TreeAnalyzer();
        
        Comparable[] heap = getNodesRootOnly();
        assertTrue("only root node", instance.isFull(heap));
        
        heap = getNodesLeft();
        assertTrue("Nodes on left Side", instance.isFull(heap));
        
        heap = getNodesRight();
        assertTrue("Nodes on right Side", instance.isFull(heap));
        
        heap = getNodesMiddle();
        assertTrue("Nodes down middle", instance.isFull(heap));
        
        heap = getNodesNotFull();
        assertFalse("Not full", instance.isFull(heap));
    }

    @Test
    public void testIsPerfect(){
        System.out.println("testIsPerfect");
        TreeAnalyzer instance = new TreeAnalyzer();
        
        Comparable[] heap = getNodesRootOnly();
        assertTrue("only root node", instance.isPerfect(heap));
        
        heap = getNodesLeft();
        assertFalse("Nodes on left Side", instance.isPerfect(heap));
        
        heap = getNodesRight();
        assertFalse("Nodes on right Side", instance.isPerfect(heap));
        
        heap = getNodesMiddle();
        assertFalse("Nodes down middle", instance.isPerfect(heap));
        
        heap = getNodesNotFull();
        assertFalse("Not full", instance.isPerfect(heap));        
        
        heap = getNodesMiddle();
        assertFalse("leaves on different levels V2", instance.isPerfect(heap));
        
        heap = getNodesSameLevel();
        assertTrue("all leaves on height level 2", instance.isPerfect(heap));         
    }
    
    @Test
    public void testIsComplete(){
        System.out.println("testIsComplete");
        TreeAnalyzer instance = new TreeAnalyzer();
        
        Comparable[] heap = getNodesRootOnly();
        assertTrue("only root node", instance.isComplete(heap));
        
        heap = getNodesLeft();
        assertFalse("Nodes on left Side", instance.isComplete(heap));
        
        heap = getNodesRight();
        assertFalse("Nodes on right Side", instance.isComplete(heap));
        
        heap = getNodesMiddle();
        assertFalse("Nodes down middle", instance.isComplete(heap));
        
        heap = getNodesNotFull();
        assertFalse("Not full", instance.isComplete(heap));        
        
        heap = getNodesMiddle();
        assertFalse("leaves on different levels V2", instance.isComplete(heap));
        
        heap = getNodesSameLevel();
        assertTrue("all leaves on height level 2", instance.isComplete(heap)); 
        
        heap =  getNodesLeftGap();
        assertFalse("Left gap", instance.isComplete(heap));       
         
        heap =  getNodesComplete();        
        assertTrue("Complete - full bottom", instance.isComplete(heap));  
        
        heap =  getNodesCompleteV2();        
        assertTrue("Complete - right gap", instance.isComplete(heap));  
    }

    @Test
    public void testIsMaxHeap() {
        System.out.println("Max Heap");
        TreeAnalyzer instance = new TreeAnalyzer();
        
        Comparable[] heap = getNodesRootOnly();
        assertTrue("only root node", instance.isAMaxHeap(heap));
        
        heap = getNodesLeft();
        assertFalse("Nodes on left Side", instance.isAMaxHeap(heap));
        
        heap = getNodesRight();
        assertFalse("Nodes on right Side", instance.isAMaxHeap(heap));
        
        heap = getNodesMiddle();
        assertFalse("Nodes down middle", instance.isAMaxHeap(heap));
        
        heap = getNodesNotFull();
        assertFalse("Not full", instance.isAMaxHeap(heap));        
        
        heap = getNodesMiddle();
        assertFalse("leaves on different levels V2", instance.isAMaxHeap(heap));
        
        heap = getNodesSameLevel();
        assertTrue("all leaves on height level 2", instance.isAMaxHeap(heap)); 
        
        heap =  getNodesLeftGap();
        assertFalse("Left gap", instance.isAMaxHeap(heap));       
         
        heap =  getNodesComplete();        
        assertTrue("Complete - full bottom", instance.isAMaxHeap(heap));  
        
        heap =  getNodesCompleteV2();        
        assertTrue("Complete - right gap", instance.isAMaxHeap(heap));  
        
        heap = getNodesMaxHeap1();
        assertTrue("Large full bottom", instance.isAMaxHeap(heap));
        
        heap = getNodesMaxHeap2();
        assertTrue("Mostly empty bottom, right node last child", instance.isAMaxHeap(heap));
        
        heap = getNodesMaxHeap3();        
        assertTrue("Mostly empty bottom, left node last child", instance.isAMaxHeap(heap));
        
        heap = getNodesMaxHeap4();
        assertTrue("Full bottom", instance.isAMaxHeap(heap));                        
        
        heap = getNodesMinHeap1();
        assertFalse("min->max",instance.isAMaxHeap(heap));
        
        heap = getNodesNotMaxHeap1();
        assertFalse("left side",instance.isAMaxHeap(heap));
        
        heap = getNodesNotMaxHeap2();     
        assertFalse("right side",instance.isAMaxHeap(heap));
        
        heap = getNodesNotMaxHeap3();
        assertFalse("gap", instance.isAMaxHeap(heap));
        
        heap = getNodesNotMaxSemiHeap1();    
        assertFalse("Mostly empty bottom, left node last child, one out of place", instance.isAMaxHeap(heap));        

    }
    
    @Test
    public void testIsMinHeap() {
        System.out.println("Min Heap");
        TreeAnalyzer instance = new TreeAnalyzer();
        
        Comparable[] heap = getNodesRootOnly();
        assertTrue("only root node", instance.isAMinHeap(heap));
        
        heap = getNodesLeft();
        assertFalse("Nodes on left Side", instance.isAMinHeap(heap));
        
        heap = getNodesRight();
        assertFalse("Nodes on right Side", instance.isAMinHeap(heap));
        
        heap = getNodesMiddle();
        assertFalse("Nodes down middle", instance.isAMinHeap(heap));
        
        heap = getNodesNotFull();
        assertFalse("Not full", instance.isAMinHeap(heap));        
        
        heap = getNodesMiddle();
        assertFalse("leaves on different levels V2", instance.isAMinHeap(heap));
        
        heap =  getNodesLeftGapV2();
        assertFalse("Left gap", instance.isAMinHeap(heap));       
                 
        heap =  getNodesCompleteV2();        
        assertFalse("Complete - right gap", instance.isAMinHeap(heap));  
        
        heap = getNodesMaxHeap1();
        assertFalse("Max Heap  Large full bottom", instance.isAMinHeap(heap));
        
        heap = getNodesNotMaxSemiHeap1();    
        assertFalse("Mostly empty bottom, left node last child, one out of place", instance.isAMinHeap(heap));    
        
        heap = getNodesSameLevel();
        assertTrue("all leaves on height level 2", instance.isAMinHeap(heap)); 
        
        heap = getNodesMinHeap1();
        assertTrue("min->max full bottom",instance.isAMinHeap(heap));
                
        heap =  getNodesComplete();        
        assertTrue("Complete - full bottom", instance.isAMinHeap(heap)); 
        
         heap =  getNodesMinHeap2();
        assertTrue("Min - left node last child",instance.isAMinHeap(heap));
        
         heap =  getNodesMinHeap3();
        assertTrue("Min - right node last child",instance.isAMinHeap(heap));

        heap =  getNodesNotMinHeap1();
        assertFalse("not min - left side only",instance.isAMinHeap(heap));
        
         heap =  getNodesNotMinHeap2();
        assertFalse("not min - right side only",instance.isAMinHeap(heap));
        
         heap =  getNodesNotMinHeap3();
        assertFalse("Not min- one out of order", instance.isAMinHeap(heap));          
    }
    
    @Test
    public void testIsMaxSemiHeap() {
        System.out.println("Max Semi Heap");
        TreeAnalyzer instance = new TreeAnalyzer();
        
        Comparable[] heap = getNodesMaxHeap1();
        heap[1]='a';
        assertTrue("Max semi - root v1", instance.isAMaxSemiHeap(heap));    
        
        heap = getNodesMaxHeap2();
        heap[1]='a';
        assertTrue("max semi - root v2", instance.isAMaxSemiHeap(heap));

        heap = getNodesMaxHeap3();
        heap[1]='c';   
        assertTrue("Max semi - last left child", instance.isAMaxSemiHeap(heap));        
   
        heap = getNodesMaxHeap1();
        heap[20]= 'z'; 
        heap[15]= 'z';  
        assertFalse("2 out of place", instance.isAMaxSemiHeap(heap));    
               
        heap = getNodesMinHeap1();
        assertFalse("Min heap, not max semi v4", instance.isAMaxSemiHeap(heap));  
    }
    
    @Test
    public void testIsMinSemiHeap() {
        System.out.println("Min Semi Heap");
        TreeAnalyzer instance = new TreeAnalyzer();
                
        Comparable[] heap = getNodesLeft();
        assertFalse("Nodes on left Side", instance.isAMinSemiHeap(heap));
        
        heap = getNodesRight();
        assertFalse("Nodes on right Side", instance.isAMinSemiHeap(heap));
        
        heap = getNodesMiddle();
        assertFalse("Nodes down middle", instance.isAMinSemiHeap(heap));
        
        heap = getNodesNotFull();
        assertFalse("Not full", instance.isAMinSemiHeap(heap));        
        
        heap = getNodesMiddle();
        assertFalse("leaves on different levels V2", instance.isAMinSemiHeap(heap));
        
        heap =  getNodesLeftGapV2();
        assertFalse("Left gap", instance.isAMinSemiHeap(heap));       
                 
        heap =  getNodesCompleteV2();        
        assertFalse("Complete - right gap", instance.isAMinSemiHeap(heap));  
        
        heap = getNodesMaxHeap1();
        assertFalse("Max Heap  Large full bottom", instance.isAMinSemiHeap(heap));
        
        heap = getNodesNotMaxSemiHeap1();    
        assertFalse("Mostly empty bottom, left node last child, one out of place", instance.isAMinSemiHeap(heap));    

        heap =  getNodesNotMinHeap1();
        assertFalse("not min - left side only",instance.isAMinSemiHeap(heap));
        
         heap =  getNodesNotMinHeap2();
        assertFalse("not min - right side only",instance.isAMinSemiHeap(heap));
        
         heap =  getNodesNotMinHeap3();
        assertFalse("Not min- one out of order", instance.isAMinSemiHeap(heap)); 
        
        heap = getNodesMinHeap1();
        heap[1] = 'z';
        assertTrue("Min Semi - root out of place",instance.isAMinSemiHeap(heap));
                
        heap =  getNodesComplete();  
        heap[2] = 'A';
        assertTrue("Min Semi - middle", instance.isAMinSemiHeap(heap));         
    }
    	/**
	 * **********************************************************************
	 * UTILITIES
	 * **********************************************************************
	 */
	//<editor-fold defaultstate="collapsed" desc="sample data">
    
        // Not Full
        private Comparable[] getNodesNotFull(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'A';
                heap[2] = 'A';
                heap[3] = 'A';
                heap[6] = 'A';
                heap[7] = 'A';
                heap[14] = 'A';   
                return heap;
        }
    
        // Full+Perfect
        private Comparable[] getNodesRootOnly(){
                Comparable[] heap = new Comparable[4];
                heap[1] = 'A';   
                return heap;
        }
        
        // Full
        private Comparable[] getNodesLeft(){
                Comparable[] heap = new Comparable[64];
                heap[1] = 'A';
                heap[2] = 'A';
                heap[3] = 'A';
                heap[6] = 'A';
                heap[7] = 'A';
                heap[14] = 'A';        
                heap[15] = 'A';
                return heap;
        }
        
        // Full
        private Comparable[] getNodesRight(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'A';
                heap[2] = 'A';
                heap[3] = 'A';
                heap[4] = 'A';
                heap[5] = 'A';
                heap[8] = 'A';        
                heap[9] = 'A';
                return heap;
        }
        
        // Full
        private Comparable[] getNodesMiddle(){
                Comparable[] heap = new Comparable[36];
                heap[1] = 'A';
                heap[2] = 'A';
                heap[3] = 'A';
                heap[6] = 'A';
                heap[7] = 'A';
                heap[12] = 'A';        
                heap[13] = 'A';
                return heap;
        }                 
        
        // Full+Perfect+Complete
        private Comparable[] getNodesSameLevel(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'A';
                heap[2] = 'A';
                heap[3] = 'A';
                heap[4] = 'A';
                heap[5] = 'A';
                heap[6] = 'A';
                heap[7] = 'A';
                return heap;
        }         
        
        // Full, not Complete because it has gaps on left side of bottom
        private Comparable[] getNodesLeftGap(){
                Comparable[] heap = new Comparable[46];
                heap[1] = 'A'; 
                heap[2] = 'A';
                heap[3] = 'A';        
                heap[6] = 'A';
                heap[7] = 'A';
                return heap;
        }  
        
        // Full, not Complete because it has gaps on left side of bottom
        private Comparable[] getNodesLeftGapV2(){
                Comparable[] heap = new Comparable[38];        
                heap[1] = 'z';
                heap[2] = 'z';
                heap[3] = 'g';
                heap[4] = 'f';
                heap[5] = 'e';
                heap[6] = 'd';
                heap[7] = 'c'; 
                heap[9] = 'a';
                return heap;
        } 
        
        // Complete + MaxHeap
        private Comparable[] getNodesComplete(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'B';
                heap[2] = 'B';
                heap[3] = 'B';
                heap[4] = 'B';
                heap[5] = 'B';
                heap[6] = 'B';
                return heap;
        }
        
        // Full+Complete+MaxHeap
        private Comparable[] getNodesCompleteV2(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'z';
                heap[2] = 'z';
                heap[3] = 'g';
                heap[4] = 'f';
                heap[5] = 'e';
                heap[6] = 'd';
                heap[7] = 'c';
                heap[8] = 'b';        
                heap[9] = 'a';
                return heap;
        }     
        
        // Full+Perfect+Complete+MaxHeap
        private Comparable[] getNodesMaxHeap1(){
                Comparable[] heap = new Comparable[128];
                char currentChar = 'z';
                for(int i = 1; i< 22; i++){
                    heap[i] = currentChar--;
                }
                return heap;
        } 
        
        // Full+Complete+MaxHeap
        private Comparable[] getNodesMaxHeap2(){
                Comparable[] heap = new Comparable[36];
                heap[1] = 'i';
                heap[2] = 'h';
                heap[3] = 'g';
                heap[4] = 'f';
                heap[5] = 'e';
                heap[6] = 'd';
                heap[7] = 'c';
                heap[8] = 'b';        
                heap[9] = 'a';
                return heap;
        } 
        
        // Complete+MaxHeap
        private Comparable[] getNodesMaxHeap3(){
                Comparable[] heap = new Comparable[35];
                heap[1] = 'i';
                heap[2] = 'h';
                heap[3] = 'g';
                heap[4] = 'f';
                heap[5] = 'e';
                heap[6] = 'd';
                heap[7] = 'c';
                heap[8] = 'b';   
                return heap;
        } 
        
        // Complete+MaxHeap
        private Comparable[] getNodesMaxHeap4(){
                Comparable[] heap = new Comparable[16];
                heap[1] = 'i';
                heap[2] = 'h';
                heap[3] = 'g';
                heap[4] = 'f';
                heap[5] = 'e';
                heap[6] = 'd';
                heap[7] = 'c'; 
                return heap;
        }
        
        // Not Max Left side
        private Comparable[] getNodesNotMaxHeap1(){
                Comparable[] heap = new Comparable[50];
                heap[1] = 'i';
                heap[2] = 'h';
                heap[4] = 'f';
                heap[8] = 'b';  
                return heap;
        }    
        
        // Not Max Right side
        private Comparable[] getNodesNotMaxHeap2(){
                Comparable[] heap = new Comparable[37];
                heap[1] = 'i';
                heap[3] = 'h';
                heap[7] = 'f';
                heap[15] = 'b';  
                return heap;
        }
        
        // Not Max gap left side
        private Comparable[] getNodesNotMaxHeap3(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'i';
                heap[2] = 'h';
                heap[3] = 'g';
                heap[4] = 'f';
                heap[5] = 'e';
                heap[6] = 'd';
                heap[7] = 'c';     
                heap[9] = 'a';   
                return heap;
        }       
        
        // Complete+MinHeap
        private Comparable[] getNodesMinHeap1(){
                Comparable[] heap = new Comparable[16];
                char currentChar = 'a';
                for(int i = 1; i< 8; i++){
                    heap[i] = currentChar++;
                } 
                return heap;
        }              
        
        // Not Max Semi Heap
        private Comparable[] getNodesNotMaxSemiHeap1(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'i';
                heap[2] = 'a';
                heap[3] = 'g';
                heap[4] = 'f';
                heap[5] = 'e';
                heap[6] = 'd';
                heap[7] = 'c';
                heap[8] = 'b';    
                return heap;
        } 
        
        //Min not a full tree- left node last child
        private Comparable[] getNodesMinHeap2(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'a';
                heap[2] = 'b';
                heap[3] = 'c';
                heap[4] = 'd';
                heap[5] = 'e';
                heap[6] = 'f';
                heap[7] = 'g';
                heap[8] = 'h';        
                heap[9] = 'i';
                heap[10] = 'j';        
                return heap;
        } 
        
        //Min not a full tree- right node last child
        private Comparable[] getNodesMinHeap3(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'a';
                heap[2] = 'b';
                heap[3] = 'c';
                heap[4] = 'd';
                heap[5] = 'e';
                heap[6] = 'f';
                heap[7] = 'g';
                heap[8] = 'h';        
                heap[9] = 'i'; 
                return heap;
        } 
        
        //Not min - left side only
        private Comparable[] getNodesNotMinHeap1(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'a';
                heap[2] = 'b';
                heap[4] = 'd';
                heap[8] = 'h';   
                return heap;
        } 
        
        //Not min - right side only
        private Comparable[] getNodesNotMinHeap2(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'a';
                heap[3] = 'c';
                heap[7] = 'g';
                heap[15] = 'j';           
                return heap;
        } 
        
        //Not min - missing 8
        private Comparable[] getNodesNotMinHeap3(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 'a';
                heap[2] = 'b';
                heap[3] = 'c';
                heap[4] = 'd';
                heap[5] = 'e';
                heap[6] = 'f';
                heap[7] = 'g';    
                heap[9] = 'i';
                heap[10] = 'j';      
                return heap;
        } 
        
    
	//</editor-fold>
}
