package cn.linkai;

import cn.linkai.sorts.*;
import org.junit.Test;

import java.util.Collections;

public class SortTest {

    @Test
    public void testSelection(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Selection<Integer> selection=new Selection<>();
        selection.sort(nums);
    }

    @Test
    public void testBubble(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Bubble<Integer> bubble=new Bubble<>();
        bubble.sort(nums);
    }

    @Test
    public void testInsert(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Insert<Integer> insert=new Insert<>();
        insert.sort(nums);
    }

    @Test
    public void testShell(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Shell<Integer> shell=new Shell<>();
        shell.sort(nums);
    }

    @Test
    public void testMerge(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Merge<Integer> merge=new Merge<>();
        merge.mergeSort(nums);
    }

    @Test
    public void testQuick(){
        Integer[] nums={2,5,3,8,6,4,1,0};
        Quick<Integer> quick=new Quick<>();
        quick.sort(nums);
    }

    @Test
    public void testHeap(){
        Integer[] nums={2,5,3,8,6,4,1,0};
        Heap<Integer> heap=new Heap<>();
        heap.sort(nums);
        for (Integer e:nums) {
            System.out.print(e+" ");
        }
    }
}
