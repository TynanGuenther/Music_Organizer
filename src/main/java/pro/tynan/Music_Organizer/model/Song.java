package pro.tynan.Music_Organizer.model;

public record Song(
        Integer id,
        String title,
        String artist,
        Genre genre,
        String audiofile_path
) {

}
