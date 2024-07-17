--
CREATE PROCEDURE `GetBookByStatus`(IN s CHAR)
BEGIN
    SELECT * FROM book WHERE status = s;
END

--
CALL GetBookByStatus(2);

-- ------------------------------------------------

--
CREATE PROCEDURE `UpdateBookStatusById`(IN b_id INT, IN b_status CHAR)
BEGIN
    UPDATE book SET status = b_status WHERE id = b_id;
END

--
CALL UpdateBookStatusById(21, 1);

-- ------------------------------------------------

--
CREATE PROCEDURE `CountBook`(OUT book_count INT)
BEGIN
    SELECT COUNT(*) FROM book;
END

--
CALL CountBook(@book_count);


