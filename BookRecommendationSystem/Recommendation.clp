
(deftemplate User (declare (from-class User)))
(deftemplate Book (declare (from-class Book)))
(deftemplate RecommendedBook (declare (from-class RecommendedBook)))
(deftemplate BookHistory (declare (from-class BookHistory)))

(defrule fav-genre-comedy
    "Recommend books based on user's favorite genre"
    ?x <- (User {favGenre == "Comedy"})
    =>
    (add (new RecommendedBook "Bridget Jones's Diary" 1234569 "Helen Fielding" 1999 "Comedy" ))
    )

(defrule fav-genre-drama
    "Recommend books based on user's favorite genre"
    ?x <- (User {favGenre == "Drama"})
    =>
    (add (new RecommendedBook "Hamlet" 1234560 "William Shakespeare" 1602 "Drama" ))
    )

(defrule fav-genre-horror
    "Recommend books based on user's favorite genre"
    ?x <- (User {favGenre == "Horror"})
    =>
    (add (new RecommendedBook "Dracula" 1234582 "Bram Stoker" 1897 "Horror" ))
    )

(defrule fav-genre-romance
    "Recommend books based on user's favorite genre"
    ?x <- (User {favGenre == "Romance"})
    =>
    (add (new RecommendedBook "The Fault in Our Stars" 1234578 "John Green" 2012 "Romance" ))
    )

(defrule fav-genre-children
    "Recommend books based on user's favorite genre"
    ?x <- (User {favGenre == "Children"})
    =>
    (add (new RecommendedBook "Winnie-the-Pooh" 1234572 "AA Milne" 1926 "Children" ))
    )

(defrule fav-genre-fantasy
    "Recommend books based on user's favorite genre"
    ?x <- (User {favGenre == "Fantasy"})
    =>
    (add (new RecommendedBook "Harry Potter and the Deathly Hallows" 1234587 "JK Rowling" 2007 "Fantasy" ))
    )

(defrule fav-genre-nonfiction
    "Recommend books based on user's favorite genre"
    ?x <- (User {favGenre == "Non-Fiction"})
    =>
    (add (new RecommendedBook "Eat, Pray, Love" 1234594 "Elizabeth Gilbert" 2006 "NonFiction"))
    )

(defrule based-on-age-15
    "Recommend books based on user's age"
    ?x <- (User {age < 15})
    =>
    (add (new RecommendedBook "Charlie and the Chocolate Factory" 1234571 "Roald Dahl" 1964 "Children"))
    )

(defrule based-on-age-25
    "Recommend books based on user's age"
    ?x <- (User {age > 15 && age < 25})
    =>
    (add (new RecommendedBook "The Hobbit" 1234586 "JRR Tolkein" 1937 "Fantasy"))
    )

(defrule based-on-age-45
    "Recommend books based on user's age"
    ?x <- (User {age > 25 && age < 45})
    =>
    (add (new RecommendedBook "Night" 1234593 "Elie Wiesel" 1958 "Non-Fiction"))
    )

(defrule based-on-age-30
    "Recommend books based on user's age"
    ?x <- (User {age > 20 && age < 30})
    =>
    (add (new RecommendedBook "Romeo and Juliet" 1234579 "William Shakespeare" 1595 "Romance"))
    )

(defrule based-on-history-comedy
    "Recommend books based on user's history"
 	?x <- (BookHistory {genre == "Comedy"})
    =>
    (add (new RecommendedBook "The Hitchhiker's Guide to the Galaxy" 1234566 "Douglas Adams" 1979 "Comedy"))
    )

(defrule based-on-history-drama
    "Recommend books based on user's history"
 	?x <- (BookHistory {genre == "Drama"})
    =>
    (add (new RecommendedBook "Othello" 1234562 "William Shakespeare" 1603 "Genre.Drama"))
    )

(defrule based-on-history-horror
    "Recommend books based on user's history"
 	?x <- (BookHistory {genre == "Horror"})
    =>
    (add (new RecommendedBook "The Shining" 1234581 "Stephen King" 1977 "Horror"))
    )

(defrule based-on-history-nonficiton
    "Recommend books based on user's history"
 	?x <- (BookHistory {genre == "Non-Fiction"})
    =>
    (add (new RecommendedBook "Into the Wild" 1234592 "Jon Krakauer" 1996 "NonFiction"))
    )

(defrule based-on-history-children
    "Recommend books based on user's history"
 	?x <- (BookHistory {genre == "Children"})
    =>
    (add (new RecommendedBook "Charlie and the Chocolate Factory" 1234571 "Roald Dahl" 1964 "Children"))
    )

(defrule based-on-history-romance
    "Recommend books based on user's history"
 	?x <- (BookHistory {genre == "Romance"})
    =>
    (add (new RecommendedBook "Me Before You" 1234580 "Jojo Moyes" 2012 "Romance"))
    )

(defrule based-on-history-fantasy
    "Recommend books based on user's history"
 	?x <- (BookHistory {genre == "Fantasy"})
    =>
    (add (new RecommendedBook "A Game of Thrones" 1234589 "George RR Martin" 1996 "Fantasy"))
    )



