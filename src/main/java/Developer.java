import java.util.ArrayList;

abstract class Developer {
    String name;
    Level level;
    ArrayList<String> technologies;
    int experience;

    public Developer(String name, Level level, ArrayList<String> technologies, int experience) {
        this.level = level;
        this.name = name;
        this.technologies = technologies;

        if (experience < 0) throw new RuntimeException("negative year exp input");
        this.experience = experience;
    }

    public void write_code() {
        System.out.println("Developer is writing code right now.....");
//        System.out.println(extra_info);
    }
}

enum Level {
    JUNIOR, MIDDLE, SENIOR
}

enum progr_types {
    Python, Java, PHP, JavaScript
}

class JavaDeveloper extends Developer {

    public JavaDeveloper(String name, Level level, ArrayList<String> technologies, int experience) {
        super(name, level, technologies, experience);
    }
    @Override
    public void write_code() {
        String technologiesString = "";
        for(String tech:this.technologies){technologiesString+= tech+ "; ";}
        String extra_info = String.format("tech: %s",technologiesString);
        System.out.println("Java Developer is writing code right know...");
        System.out.println(extra_info);
    }

}

class PythonDeveloper extends Developer {
    public PythonDeveloper(String name, Level level, ArrayList<String> technologies, int experience) {
        super(name, level, technologies, experience);
    }
    @Override
    public void write_code() {
        String technologiesString = "";
        for (String tech : this.technologies) {
            technologiesString += tech + "; ";
        }
        String extra_info = String.format("name: %s , level: %s, tech: %s, exp: %d", name, level.toString(), technologiesString, experience);
        System.out.println("Python Developer is writing code right now...");
        System.out.println(extra_info);
    }
}