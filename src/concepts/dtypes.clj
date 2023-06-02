(ns concepts.dtypes)


;; Strings
(println "This is a string")

; Defining a variable
(def my-str-var (str "This is", " a string"))
(println my-str-var)
(println (type my-str-var))

;; Characters
(def my-char \Z)
(println my-char)
(println (type my-char))

;; Regular Expressions
(def my-regex #"Clojure")
(println (type my-regex))

; Finding match
(println(re-find my-regex "Clojure is great!"))
(println(re-find my-regex "Scala is great!"))

;; Ints
(def my-int 100)
(println (type my-int))

;; Floats
(def my-decimal 3.14159)
(println (type my-decimal))

; Addition of int and float
(def result (+ my-int my-decimal))
(println result)
(println (type result))

;; Ratio
(def my-ratio 100/8)
(def prefix-ratio (/ 2 3))
(def whole-number-ratio 10/5)

(println (type my-ratio))
(println (type prefix-ratio))
(println (type whole-number-ratio))

; Gets denominator
(println (denominator my-ratio)) ; where 100/8 becomes 25/2

; Check is ratio
(println (ratio? my-ratio)) ; the function that ends with ? indicates a boolean returned

;; Vectors
(def my-vector [1 2 3 4])
(println (filter even? my-vector))

;; List
(def my-list `(1 2 3 4))
(println (filter odd? my-list))

;; Sets
(def my-set #{1 2 3 4 5}) ; Set is unordered. Error if duplicates found
(println my-set)

(def converted-to-set (set [1 2 1 2 3 4 2 3 1 1]))
(println converted-to-set)

;; Maps
(def my-map {:a 1 :b 2 :c 3})

; Merge maps
(def my-map-2 {:a 4 :d 4 :e 6})
(println (merge my-map my-map-2))

; Print values of map
(println (vals my-map))

;; Symbol
(println (type map))
(println (map (fn [num] (+ num 1)) `(1, 2, 3, 4, 5)))
(println (type nil))
(println (type true))
(println (type false))

:my-keyword
(println (type :my-keyword))
