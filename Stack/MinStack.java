//pair approach
class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class MinStack {
    Stack < Pair > st;
    public MinStack() {
        st = new Stack < > ();
    }

    public void push(int x) {
        int min;
        if (st.isEmpty()) {
            min = x;
        } else {
            min = Math.min(st.peek().y, x);
        }
        st.push(new Pair(x, min));
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().x;
    }

    public int getMin() {
        return st.peek().y;
    }
}

//optimal
class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long value = Long.valueOf(val);
        if (st.isEmpty()) {
            min = value;
            st.push(value);
        } else {
            if (value < min) {
                st.push(2 * value - min);
                min = value;
            } else {
                st.push(value);
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        long val = st.pop();
        if (val < min) {
            min = 2 * min - val;
        }
    }
    
    public int top() {
        long val = st.peek();
        if (val < min) {
            return (int) min;
        }
        return (int) val;
    }
    
    public int getMin() {
        if (st.isEmpty()) return -1;
        return (int) min;
    }
}

TC-O(1)
SC-O(n)
