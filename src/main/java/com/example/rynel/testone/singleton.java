package com.example.rynel.testone;

/**
 * Created by rynel on 9/29/2017.
 */

public class singleton {

            private static singleton instance = null;
            protected singleton() {
                // Exists only to defeat instantiation.
            }
            public static singleton getInstance() {
                if(instance == null) {
                    instance = new singleton();
                }
                return instance;
            }
        }
