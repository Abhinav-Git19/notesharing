package com.scaleup.notesharing.repositores;

import com.scaleup.notesharing.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
