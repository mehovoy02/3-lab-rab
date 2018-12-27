public class OpenAudio extends Union {//наследование в аналогичных классах открытия
    public OpenAudio(String name, String type) { super(name,type); }//Класс отдает принимаемые строки суперклассу Union

    public String open(){//полиморфизм в аналогичных классах открытия
        return "Файл mp3 открывается!\n";


    }

}

