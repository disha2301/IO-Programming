package com.gevernova.objtojson;

    class Student {
        public String name;
        public int age;

        // Constructor
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Default constructor (required for Jackson)
        public Student() {}
    }
