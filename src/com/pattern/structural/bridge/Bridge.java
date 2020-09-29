package com.pattern.structural.bridge;

public class Bridge {
    public static void main(String[] args) {
        Developer JavaDeveloper = new JavaDeveloper();
        Developer CppDeveloper = new CppDeveloper();
        Program game = new Game(JavaDeveloper);
        Program sqlProgram = new SQLProgram(CppDeveloper);
        Program[] programs = {game, sqlProgram};
        game.setId(241);
        game.setName("Plants vs monsters");
        game.setVersion(1.0);
        sqlProgram.setId(41);
        sqlProgram.setName("SQLite");
        sqlProgram.setVersion(2.14);

        for (Program p : programs) {
            p.getInfo();
            p.doWork();
        }
    }
}
