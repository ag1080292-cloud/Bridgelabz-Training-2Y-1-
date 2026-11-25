package StackBasics;

import java.util.*;
public class basics {
    static void main(String[] args) {

                Stack<Integer>st=new Stack<>();
                st.push(10);
                st.push(20);
                st.push(30);
                st.push(40);
                st.push(50);
                System.out.println(st);
                st.pop();
                st.push(60);
                System.out.println(st);

            }

        }


