SELECT class.teacher_name, student.id, student.student_name FROM class INNER JOIN student ON class.class_title = student.class_title WHERE class.teacher_name = 'Ms. Lovelace';
