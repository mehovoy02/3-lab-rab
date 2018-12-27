/* Main.java - файл
 *Авторское право Алтынпара А.В.
 *
 *  Назначение
 *  Содержит функции, необходимые для решения первой задачи
 *  Описание: открыть файл с нужным разрешением
 *  Дата создания: 28.11.2018
 *  История версий: 1.0 BETA
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь к файлу:\n");
        String way = reader.readLine();
        //изьятие из пути названия и типа файла
        //первый способ изъятия из пути названия и типа файла:
        File f = new File(way);
        String name_type_file = f.getName();//название файла с его типом
        String[] name_type = name_type_file.split("\\.");//массив из 2 элементов: название и тип файла

        String name_file = name_type [0];//название
        String type_file = name_type [1];//тип

        OpenText text = new OpenText(name_file, type_file);
        OpenPicture foto = new OpenPicture(name_file, type_file);
        OpenVideo video = new OpenVideo(name_file, type_file);
        OpenAudio audio = new OpenAudio(name_file, type_file);
        OpenDifferent diff = new OpenDifferent(name_file, type_file);

        switch (type_file) {
            case "mp3":
                System.out.println(audio.open() + audio.Open_file());
                break;

            case "mp4":
                System.out.println(video.open() + video.Open_file());
                break;

            case "txt":
                System.out.println(text.open() + text.Open_file());
                break;

            case "png":
                System.out.println(foto.open() + foto.Open_file());
                break;


            //проверка на другие форматы:
            default:
                System.out.println(diff.open() + diff.Open_file());
                break;
        }
    }
}
