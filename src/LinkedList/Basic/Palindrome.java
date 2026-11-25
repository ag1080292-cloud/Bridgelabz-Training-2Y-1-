package LinkedList.Basic;

public class Palindrome {

        static class Node {
            int data;
            Node next;
            Node prev;

            Node(int data) {
                this.data = data;
            }
        }

        static Node head = null;
        static Node tail = null;

        public static void insert(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        public static boolean isPalindrome() {

            Node left = head;
            Node right = tail;

            while (left != null && right != null
                    && left != right && left.prev != right) {

                if (left.data != right.data) {
                    return false;
                }

                left = left.next;
                right = right.prev;
            }

            return true;
        }

        public static void main(String[] args) {

            insert(1);
            insert(2);
            insert(3);
            insert(2);
            insert(1);

            System.out.println(isPalindrome());
        }
    }

