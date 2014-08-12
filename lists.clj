; Copied from http://java.ociweb.com/mark/clojure/article.html#Lists
; To run: lein exec lists.clj

; The following three ways define the same list
(def stooges (list "Moe" "Larry" "Curly"))
(def stooges (quote ("Moe" "Larry" "Curly")))
(def stooges '("Moe" "Larry" "Curly"))

(println
  "stooges ==" stooges)

(println
  "(some #(= % \"Moe\") stooges) =="
  (some #(= % "Moe") stooges))

(println
  "(some #(= % \"Mark\") stooges) =="
  (some #(= % "Mark") stooges))

; Another approach is to create a set from the list
; and then use the contains? function on the set as follows.
(println
  "(contains? (set stooges) \"Moe\") =="
  (contains? (set stooges) "Moe"))

(println
  "(conj stooges \"Shemp\") =="
  (conj stooges "Shemp"))

(def more-stooges (conj stooges "Shemp"))
(println "more-stooges ==" more-stooges)

(println
  "(remove #(= % \"Curly\") more-stooges) =="
  (remove #(= % "Curly") more-stooges))

(def kids-of-mike '("Greg" "Peter" "Bobby"))
(println "kids-of-mike ==" kids-of-mike)
(def kids-of-carol '("Marcia" "Jan" "Cindy"))
(println "kids-of-carol ==" kids-of-carol)

(println
  "(into kids-of-mike kids-of-carol) =="
  (into kids-of-mike kids-of-carol))

(println
  "(peek kids-of-mike) =="
  (peek kids-of-mike))

(println
  "(pop kids-of-mike) =="
  (pop kids-of-mike))
