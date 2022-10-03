public class stack {
    node top;
    int size;

    public stack() {
        this.top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void pop2() {
        top = top.next;
    }
    public void push(int info) {
        this.size++;
        node newNode = new node(info);
        if (isEmpty()) {
            this.top = newNode;
        } else {
            node nn = top;
            this.top = newNode;
            this.top.next = nn;
        }
    }

    public node getTop() {
        return this.top;
    }
    public int pop() {
        return this.top.info;
    }

    public void display() {
        node newnode = top;
        while (newnode.next != null) {
            System.out.println(newnode.info);
            newnode = newnode.next;
        }
        System.out.println(newnode.info);
    }
    public void display2() {
        node n = top;
        int size2 =size-1;
        for (int i = 0; i < size; i++) {
            if (n == null) {
                break;
            }else{
                System.out.println("data ["+size2+"] = " + n.info );
                n = n.next;
                size2--;
                
            }
        }
    }
}
