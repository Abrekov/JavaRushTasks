package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("output.txt");
            InputStream inputStream = new FileInputStream("output.txt");

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (ivanov.hashCode() == somePerson.hashCode()) {
                if (ivanov.equals(somePerson)) {
                    System.out.println(true);
                }
            } else {
                System.out.println(false);
            }

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(name);
            boolean isAssetsEmpty = assets.isEmpty();
            writer.println(isAssetsEmpty);

            if (!isAssetsEmpty) {
                for (Asset asset: assets) {
                    String name = asset.getName();
                    String price = String.valueOf(asset.getPrice());
                    writer.println(name);
                    writer.println(price);
                }
            }

            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            name = reader.readLine();
            boolean isAssetsEmpty = Boolean.parseBoolean(reader.readLine());

            if (!isAssetsEmpty) {
                while (reader.ready()) {
                    String name = reader.readLine();
                    double price = Double.parseDouble(reader.readLine());
                    assets.add(new Asset(name, price));
                }
            }

            reader.close();
        }
    }
}
