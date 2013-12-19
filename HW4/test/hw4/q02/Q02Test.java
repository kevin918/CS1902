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
public class Q02Test {
    
    
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
        heap[1]=80;
        assertTrue("Max semi - root v1", instance.isAMaxSemiHeap(heap));    
        
        heap = getNodesMaxHeap2();
        heap[1]=70;
        assertTrue("max semi - root v2", instance.isAMaxSemiHeap(heap));

        heap = getNodesMaxHeap3();
        heap[1]=70;   
        assertTrue("Max semi - last left child", instance.isAMaxSemiHeap(heap));        
                
        heap = getNodesMaxHeap1();
        heap[63]=100; 
        heap[33]=100;  
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
        heap[1] = 4;
        assertTrue("Min Semi - root out of place",instance.isAMinSemiHeap(heap));
                
        heap =  getNodesComplete();  
        heap[2] = 90;
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
                heap[1] = 100;
                heap[2] = 100;
                heap[3] = 100;
                heap[6] = 100;
                heap[7] = 100;
                heap[14] = 100;   
                return heap;
        }
    
        // Full+Perfect
        private Comparable[] getNodesRootOnly(){
                Comparable[] heap = new Comparable[4];
                heap[1] = 100;   
                return heap;
        }
        
        // Full
        private Comparable[] getNodesLeft(){
                Comparable[] heap = new Comparable[64];
                heap[1] = 100;
                heap[2] = 100;
                heap[3] = 100;
                heap[6] = 100;
                heap[7] = 100;
                heap[14] = 100;        
                heap[15] = 100;
                return heap;
        }
        
        // Full
        private Comparable[] getNodesRight(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 100;
                heap[2] = 100;
                heap[3] = 100;
                heap[4] = 100;
                heap[5] = 100;
                heap[8] = 100;        
                heap[9] = 100;
                return heap;
        }
        
        // Full
        private Comparable[] getNodesMiddle(){
                Comparable[] heap = new Comparable[36];
                heap[1] = 100;
                heap[2] = 100;
                heap[3] = 100;
                heap[6] = 100;
                heap[7] = 100;
                heap[12] = 100;        
                heap[13] = 100;
                return heap;
        }                 
        
        // Full+Perfect+Complete
        private Comparable[] getNodesSameLevel(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 100;
                heap[2] = 100;
                heap[3] = 100;
                heap[4] = 100;
                heap[5] = 100;
                heap[6] = 100;
                heap[7] = 100;
                return heap;
        }         
        
        // Full, not Complete because it has gaps on left side of bottom
        private Comparable[] getNodesLeftGap(){
                Comparable[] heap = new Comparable[46];
                heap[1] = 100; 
                heap[2] = 100;
                heap[3] = 100;        
                heap[6] = 100;
                heap[7] = 100;
                return heap;
        }  
        
        // Full, not Complete because it has gaps on left side of bottom
        private Comparable[] getNodesLeftGapV2(){
                Comparable[] heap = new Comparable[38];        
                heap[1] = 10;
                heap[2] = 10;
                heap[3] = 20;
                heap[4] = 11;
                heap[5] = 50;
                heap[6] = 25;
                heap[7] = 30;
                heap[9] = 26;  
                return heap;
        } 
        
        // Complete + MaxHeap
        private Comparable[] getNodesComplete(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 100;
                heap[2] = 100;
                heap[3] = 100;
                heap[4] = 100;
                heap[5] = 100;
                heap[6] = 100;
                return heap;
        }
        
        // Full+Complete+MaxHeap
        private Comparable[] getNodesCompleteV2(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 100;
                heap[2] = 80;
                heap[3] = 90;
                heap[4] = 40;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;
                heap[8] = 35;
                heap[9] = 30;
                return heap;
        }     
        
        // Full+Perfect+Complete+MaxHeap
        private Comparable[] getNodesMaxHeap1(){
                Comparable[] heap = new Comparable[128];
                int currentNumber = 100;
                for(int i = 1; i< 64; i++){
                    heap[i] = currentNumber--;
                }
                return heap;
        } 
        
        // Full+Complete+MaxHeap
        private Comparable[] getNodesMaxHeap2(){
                Comparable[] heap = new Comparable[36];
                heap[1] = 100;
                heap[2] = 80;
                heap[3] = 90;
                heap[4] = 80;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;
                heap[8] = 10;        
                heap[9] = 60;
                return heap;
        } 
        
        // Complete+MaxHeap
        private Comparable[] getNodesMaxHeap3(){
                Comparable[] heap = new Comparable[35];
                heap[1] = 100;
                heap[2] = 80;
                heap[3] = 90;
                heap[4] = 20;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;
                heap[8] = 10;      
                return heap;
        } 
        
        // Complete+MaxHeap
        private Comparable[] getNodesMaxHeap4(){
                Comparable[] heap = new Comparable[16];
                heap[1] = 100;
                heap[2] = 80;
                heap[3] = 90;
                heap[4] = 20;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;    
                return heap;
        }
        
        // Not Max Left side
        private Comparable[] getNodesNotMaxHeap1(){
                Comparable[] heap = new Comparable[50];
                heap[1] = 100;
                heap[2] = 80;
                heap[4] = 60;
                heap[8] = 10;
                return heap;
        }    
        
        // Not Max Right side
        private Comparable[] getNodesNotMaxHeap2(){
                Comparable[] heap = new Comparable[37];
                heap[1] = 100;
                heap[3] = 80;
                heap[7] = 60;
                heap[15] = 10;
                return heap;
        }
        
        // Not Max gap left side
        private Comparable[] getNodesNotMaxHeap3(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 100;
                heap[2] = 80;
                heap[3] = 90;
                heap[4] = 80;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;
                heap[9] = 10;     
                return heap;
        }       
        
        // Complete+MinHeap
        private Comparable[] getNodesMinHeap1(){
                Comparable[] heap = new Comparable[16];
                for(int i = 1; i< 8; i++){
                    heap[i] = i;
                } 
                return heap;
        }              
        
        // Not Max Semi Heap
        private Comparable[] getNodesNotMaxSemiHeap1(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 100;
                heap[2] = 80;
                heap[3] = 90;
                heap[4] = 88;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;
                heap[8] = 40;       
                return heap;
        } 
        
        //Min not a full tree- left node last child
        private Comparable[] getNodesMinHeap2(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 1;
                heap[2] = 8;
                heap[3] = 9;
                heap[4] = 80;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;
                heap[8] = 100;        
                heap[9] = 86;
                heap[10] = 70;        
                return heap;
        } 
        
        //Min not a full tree- right node last child
        private Comparable[] getNodesMinHeap3(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 1;
                heap[2] = 8;
                heap[3] = 9;
                heap[4] = 80;
                heap[5] = 60;
                heap[6] = 89;
                heap[7] = 70;
                heap[8] = 100;        
                heap[9] = 86;          
                return heap;
        } 
        
        //Not min - left side only
        private Comparable[] getNodesNotMinHeap1(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 10;
                heap[2] = 10;
                heap[4] = 20;
                heap[8] = 40;         
                return heap;
        } 
        
        //Not min - right side only
        private Comparable[] getNodesNotMinHeap2(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 10;
                heap[3] = 10;
                heap[7] = 20;
                heap[15] = 40;         
                return heap;
        } 
        
        //Not min - missing 8
        private Comparable[] getNodesNotMinHeap3(){
                Comparable[] heap = new Comparable[32];
                heap[1] = 20;
                heap[2] = 10;
                heap[3] = 20;
                heap[4] = 11;
                heap[5] = 50;
                heap[6] = 25;
                heap[7] = 30;
                heap[9] = 26;         
                return heap;
        } 
        
    
	//</editor-fold>
}
