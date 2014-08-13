; Copied from http://java.ociweb.com/mark/clojure/article.html#Sets
; To run: lien exec sets.clj

(def stooges (hash-set "Moe" "Larry" "Curly")) ; not sorted
(def stooges #{"Moe" "Larry" "Curly"}) ; same as previous
(def stooges (sorted-set "Moe" "Larry" "Curly"))

(println "stooges ==" stooges)

(println
  "(contains? stooges \"Moe\") =="
  (contains? stooges "Moe"))

(println
  "(contains? stooges \"Mark\") =="
  (contains? stooges "Mark"))

(println
  "(stooges \"Moe\") =="
  (stooges "Moe"))

(println
  "(stooges \"Mark\") =="
  (stooges "Mark"))

(println
  "(conj stooges \"Shemp\") =="
  (conj stooges "Shemp"))

(println
  "(disj (conj stooges \"Shemp\") \"Curly\") =="
  (disj (conj stooges "Shemp") "Curly"))

