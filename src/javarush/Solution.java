package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName, 'm');

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName, 'f');

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, 'm', catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, 'f', catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, 'm', catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, 'f', catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private char sex;
        private Cat mother;
        private Cat father;
        private Cat parent;

        Cat(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }

        Cat(String name, char sex, Cat parent) {
            this.name = name;
            this.sex = sex;
            this.parent = parent;
        }

        Cat(String name, char sex, Cat mother, Cat father) {
            this.name = name;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }



                @Override
        public String toString() {
            if (parent == null) {
                return "The cat's name is " + name + ", no mother, no father";
            }
            if (sex == 'm') {
                return "The cat's name is " + name + ", father is " + father.name;
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name;
            }
//            if (sex == 'm') {
//                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
//
//            }
//            return null;
        }
    }
}
