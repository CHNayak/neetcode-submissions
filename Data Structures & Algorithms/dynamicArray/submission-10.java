class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int cap) {
        this.capacity = cap;
        this.size = 0;
        this.arr = new int[this.capacity];

    }

    public int get(int i) {
        return arr[i];

    }

    public void set(int i, int n) {
        arr[i] = n;
       // size = size + 1;

    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        arr[size] = n;
        size = size + 1;

    }

    public int popback() {
        if(size>0){
            size--;
        }
        return arr[size];

    }

    private void resize() {
        if(capacity >= 1){
            capacity = capacity * 2;

        }else{
            capacity = 1;
        }
        
        int[] temp = new int[capacity];
        for(int i= 0 ; i< size;i++){
            temp[i] = arr[i];
        }
        arr = temp;

    }

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;

    }
}
