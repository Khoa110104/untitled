package oop.midterm2023_1.students;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        head = null;
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        MyLinkedListNode node = getNodeByIndex(index);
        if (node == null) {
            return null;
        }
        return node.getPayload();
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     *
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        /* TODO */
        if (index == 0 && head != null) {
            head = new MyLinkedListNode(payload, head.getNext());
            return;
        }
        remove(index);
        insert(payload, index);
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        try {
            checkBoundaries(index, size - 1);
            if (index == 0) {
                head = head.getNext();
            } else {
                MyLinkedListNode current = getNodeByIndex(index - 1);
                current.setNext(current.getNext().getNext());
            }
            size--;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        insert(payload, size);
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        try {
            checkBoundaries(index, size);
            if (index == 0) {
                head = new MyLinkedListNode(payload, head);
            } else {
                MyLinkedListNode current = getNodeByIndex(index - 1);
                current.setNext(new MyLinkedListNode(payload, current.getNext()));
            }
            size++;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

        /**
         * Tạo iterator để cho phép duyệt qua các phần tử của list.
         *
         * @return
         */
        @Override
        public MyIterator iterator () {
            /* TODO */
            return new MyLinkedListIterator(head);
        }

        /**
         * Lấy node ở vị trí index.
         *
         * @param index
         * @return
         */
        private MyLinkedListNode getNodeByIndex ( int index){
            /* TODO */
            MyLinkedListNode current = null;
            try {
                checkBoundaries(index, size);
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.getNext();
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
            return current;
        }

        private void checkBoundaries ( int index, int limit){
            if (index < 0 || index > limit) {
                throw new IndexOutOfBoundsException("Error!!!");
            }
        }
    }
