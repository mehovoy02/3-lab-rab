public class Union {


    private String name_file;//инкапсуляция
    private String type_file;//инкапсуляция

    public Union() {}

    public Union(String name, String type) {
        this.name_file = name;
        this.type_file = type;

    }
    public String Open_file() { return "Файл " + name_file + "." + type_file + " успешно открыт"; }
}

