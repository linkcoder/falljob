package cn.linkai;

import cn.linkai.sorts.Selection;
import org.junit.Test;

public class SortTest {

    @Test
    public void testSelection(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Selection<Integer> selection=new Selection<>();
        selection.sort(nums);
    }
}
