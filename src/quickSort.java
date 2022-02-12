public class quickSort{
    public class QuickSort {

        public static void quickSort(Comparable[] list, int inf, int sup) {
            int i = inf - 1;
            int j = sup;
            boolean flag = true;
            Comparable temp = 0;      
            if (inf >= sup) {
                return;
            }
            Comparable elem_div = list[sup];       
            while (flag) {
                while(list[++i].compareTo(elem_div) < 0) ; //Move the index i until it finds an element bigger than elem_div
                while((list[--j].compareTo(elem_div) > 0) && (j > inf)); //Move the index j until it finds element smaller than elem_div
                
                if (i < j) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                } else {
                    flag = false;
                }
            }
            
            temp = list[i];
            list[i] = list[sup];
            list[sup] = temp;
            quickSort(list, inf, i - 1);
            quickSort(list, i + 1, sup);
        }
        
    }

}