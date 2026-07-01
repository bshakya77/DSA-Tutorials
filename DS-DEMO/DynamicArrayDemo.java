/******************************************/
// Author: Bijay Shakya
// Data Structure: Dynamic Array and its Operations
/******************************************/


public class DynamicArrayDemo {

    int size;
    int capacity = 10;
    Object[] array;

    //Constructors
    public DynamicArrayDemo() {
        this.array = new Object[capacity];
    }

    public DynamicArrayDemo(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    //Operation Functions
    public void add(Object data){

        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
            if (size >= capacity) {
                grow();
            }
            for(int i = size; i > index; i--){
                array[i] = array[i - 1];  //increase the length
            }
            array[index] = data;
            size++;
    }

    public void delete(Object data){

        for(int i = 0; i < size; i++){
            if (array[i] == data) {
                for(int j = 0; j < (size - i - 1); j++){
                    array[i + j] = array[i + j + 1]; //shifting element
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
    
        for(int i = 0; i < size; i++){
            if (array[i] == data) {
                return i;
            }    
        }

        return -1;
    }

    public Boolean isEmpty(){
        return size==0;
    }

    private void grow(){

        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink(){

        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public String toString(){

        String input = "";
        for(int i = 0; i < capacity; i++){
            input += array[i] + ", ";
        }

        if(input != ""){
            input = "[" + input.substring(0, input.length() - 2) + "]";
        }
        else{
            input = "[]";
        }
        return input;
    }
    
     public static void main(String[] args) {
        
        // Defination:
        // Static array has fixed size and capacity. So, cannot be extended over.
        // Provides the extra capacity before hand to add more elements as per requirements. 
        
        // Advantages of Dynamic Array:
        // 1. Random access of elements O(1)
        // 2. Good locality of reference and data cache utilization (continous index references)
        // 3. Easy to insert/delete at the end (no shifting required)

        // Disadvantages of Dynamic Array:
        // 1. Waste of memory if not used
        // 2. Shifting elements is time consuming O(n) if randomly deleted/inserted
        // 3. Expanding and shrinking the array is time consuming O(n)
        
        // Dynamic array Operations
        DynamicArrayDemo dynamicArray = new DynamicArrayDemo(5);

        dynamicArray.add("Plus");
        dynamicArray.add("Minus");
        dynamicArray.add("Multiply");
        dynamicArray.add("Divide");
        dynamicArray.add("Exponential");
        dynamicArray.add("Percentage");

        dynamicArray.delete("Percentage");
        dynamicArray.delete("Exponential");
        dynamicArray.delete("Divide");

        dynamicArray.insert(0, "Modulus");
        dynamicArray.delete("Minus");
        int searchIndex = dynamicArray.search("Plus");

        System.out.println(dynamicArray);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Is Empty? : " + dynamicArray.isEmpty());
        System.out.println("Search Item Index ? : " + searchIndex);
        
    }
}
