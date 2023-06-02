(ns concepts.functions)

;; Regular Functions
(defn prefix-strs
  [str-to-be-prefixed]
  (str "prefix-" str-to-be-prefixed))

;; Anonymous function
(defn filter-maps-by-value [maps value]
  (filter #(= value (:value %)) maps))

;; Assign anonymous function to a variable
(def addition #(+ %1 %2))


;; Multi-arity function
(defn get-delimiter
  ([] "you have no args")
  ([first-arg] (str first-arg ":"))
  ([first-arg, second-arg] (str first-arg "-" second-arg))
  ([first-arg, second-arg, third-arg] (str first-arg ";" second-arg ";" third-arg)))

;; Variadic function
(defn aggregate-counts [& counts]
  (apply + counts))

;; Recursion
(defn ackermann [m n]
  (case m
    0 (inc n)
    (case n
      0 (ackermann (dec m) 1)
      (ackermann (dec m) (ackermann m (dec n))))))

(defn factorial [n]
  (if (zero? n)
    1
    (* n (factorial (dec n)))))
