package unit2;

public class MethodOverloading {

    public static void main(String[] args) {
        //Method Overloading
        Sample sample = new Sample();
        sample.print(10);
        sample.print("Name");
        sample.print(98.70);

        //Need Method Overloading
        int[] arr = {10,20,57,39,23,0};

        SearchUtil searchUtil = new SearchUtil();
        System.out.println(searchUtil.search(arr, 20));
        System.out.println(searchUtil.search(arr, 57, 3));
    }

}

class Sample{
    public void print(int a){
        System.out.println(a);
    }

    public void print(String a){
        System.out.println(a);
    }

    public void print(double a){
        System.out.println(a);
    }
}

class SearchUtil{

    public int search(int[] arr, int ele){
        return search(arr, ele, 0);
    }

    public int search(int[] arr, int ele, int pos){
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

}
