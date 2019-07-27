package com.astar.planeolnotes.utilities;

import com.astar.planeolnotes.model.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SampleData {

    private static final String SAMPLE_TEXT_1 = "Sample text";
    private static final String SAMPLE_TEXT_2 = "Sample text\nsample text";
    private static final String SAMPLE_TEXT_3 = "Sample text multiline Lorem Ipsum - это текст-\"рыба\", " +
            "часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для " +
            "текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую\n\n" +
            "коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem " +
            "Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный " +
            "дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами " +
            "Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, " +
            "в шаблонах которых используется Lorem Ipsum.";

    public  static Date getDate(int diff) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.MILLISECOND, diff);
        return cal.getTime();
    }

    public static List<NoteEntity> getNotes() {
        List<NoteEntity> notes = new ArrayList<>();
        notes.add(new NoteEntity(1, getDate(0), SAMPLE_TEXT_1));
        notes.add(new NoteEntity(2, getDate(-1), SAMPLE_TEXT_2));
        notes.add(new NoteEntity(3, getDate(-2), SAMPLE_TEXT_3));
        return notes;
    }

}
