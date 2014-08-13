; Copied from http://java.ociweb.com/mark/clojure/article.html#Vectors
; To run: lein exec vectors.clj

(def stooges (vector "Moe" "Larry" "Curly"))
(def stooges ["Moe" "Larry" "Curly"])

(println "stooges ==" stooges)

(println
  "(get stooges 1 \"unknown\") =="
  (get stooges 1 "unknown"))

(println
  "(get stooges 3 \"unknown\") =="
  (get stooges 3 "unknown"))

(println
  "(assoc stooges 2 \"Shemp\") =="
  (assoc stooges 2 "Shemp"))

(println
  "(assoc stooges 3 \"Shemp\") =="
  (assoc stooges 3 "Shemp"))

(println
  "(subvec stooges 1 2) =="
  (subvec stooges 1 2))

; The exapmles below are copied from lists.clj as exapmles of how those calls work differently/the same on vectors

(println
    "(some #(= % \"Moe\") stooges) =="
    (some #(= % "Moe") stooges))

(println
    "(some #(= % \"Mark\") stooges) =="
    (some #(= % "Mark") stooges))

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

(def kids-of-mike ["Greg" "Peter" "Bobby"])
(println "kids-of-mike ==" kids-of-mike)
(def kids-of-carol ["Marcia" "Jan" "Cindy"])
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
