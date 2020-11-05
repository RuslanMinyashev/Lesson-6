package ru.lesson1;

public class Animal {

        public String name;
        public int run;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void animalInfo() {
            //  System.out.println();

        }
    }

    class Cat extends Animal {

        protected boolean sweem;
        int jump;

        public Cat(String name, int run, boolean sweem, int jump) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }

        public void catInfo() {
            System.out.println("Имя Кота: " + name + " : Ограничения: " + run + " метров;" + " плавание:" + sweem + " ; прыжок: " + jump + " метра;");
        }
    }

    class Dog extends Animal {

        public double jump;
        public int sweem;

        public Dog(String name, int run, int sweem, double jump) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }

        public void dogInfo() {
            System.out.println("Имя Собаки: " + name + " Ограничения: " + run + " метров;" + " плавание: " + sweem + " Прыжок: " + jump + " метра;");
        }
    }

    class Main {
        public static void main(String[] args){

            Animal animal = new Animal("CatsCategory");
            Cat cat = new Cat("Васька", 200, false, 2);
            animal.animalInfo();
            cat.animalInfo();
            cat.catInfo();

            Animal danimal = new Animal("Dogs");
            Dog dog = new Dog("Шарик", 500, 10, 0.5);
            danimal.animalInfo();
            dog.animalInfo();
            dog.dogInfo();

        }
    }

