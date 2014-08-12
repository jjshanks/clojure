; Copied from http://java.ociweb.com/mark/clojure/article.html#Collections
; To run: lein exec collections.clj

(println 
  "(count [19 \"yellow\" true]) ==" 
  (count [19 "yellow" true]))

(println
  "(reverse [2 4 7]) =="
  (reverse [2 4 7]))

; The next line uses an anonymous function that adds 3 to its argument.
(println
  "(map #(+ % 3) [2 4 7]) =="
  (map #(+ % 3) [2 4 7]))

(println
  "(map + [2 4 7] [5 6] [1 2 3 4]) =="
  (map + [2 4 7] [5 6] [1 2 3 4]))

(println
  "(apply + [2 4 7]) =="
  (apply + [2 4 7]))

(def stooges ["Moe" "Larry" "Curly" "Shemp"])

(println "stooges ==" stooges)

(println
  "(first stooges) =="
  (first stooges))

(println
  "(second stooges) =="
  (second stooges))

(println
  "(last stooges) =="
  (last stooges))

(println
  "(nth stooges 2) =="
  (nth stooges 2))

(println
  "(every? #(instance? String %) stooges) =="
  (every? #(instance? String %) stooges))

(println
  "(not-every? #(instance? String %) stooges) =="
  (not-every? #(instance? String %) stooges))

(println
  "(some #(instance? Number %) stooges) =="
  (some #(instance? Number %) stooges))

(println
  "(not-any? #(instance? Number %) stooges) =="
  (not-any? #(instance? Number %) stooges))
