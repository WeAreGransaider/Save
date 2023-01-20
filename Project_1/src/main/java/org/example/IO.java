package org.example;


public class IO {
    public static void main(String[] args) {
    }
    }
        /*byte[] buffer = new byte[971];
        try (FileInputStream fin =
                     new FileInputStream("C:\\!repo\\Students\\JAVA\\Viktor\\text.txt")) {
            System.out.println("файл найден");
            System.out.println("размер файла = " + fin.available() + " байтов");
            int i = 0;
            int buf = fin.read();
            while (buf != -1) {
                if (buf > 96 && buf < 123) {
                    buffer[i] = (byte) (buf - 32);
                } else {
                    buffer[i] = (byte) buf;
                }
                i++;
                buf = fin.read();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream("C:\\!repo\\Students\\JAVA\\Viktor\\text.txt")) {
            fos.write(buffer, 0, 971);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }*/



