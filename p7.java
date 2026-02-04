
class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        List<Integer> res = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);

            if (a == b && b == c) {
                res.add(a);
                
                while (i < arr1.size() && arr1.get(i) == a) i++;
                while (j < arr2.size() && arr2.get(j) == a) j++;
                while (k < arr3.size() && arr3.get(k) == a) k++;
            } 
            else if (a < b) {
                i++;
            } else if (b < c) {
                j++;
            } else {
                k++;
            }
        }
        
        return res;
    }
}
