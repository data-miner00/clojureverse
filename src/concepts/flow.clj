(ns concepts.flow)

;; If statement
(defn odd-or-even [number]
  (if (odd? number) "odd" "even"))

(defn odd-or-even-side-effect [number]
  (if (odd? number)
    (do (println "this is odd") "odd")
    (do (println "this is even") "even")))

(defn greet [name]
  (when name
    (str "hello " name)))

(defn status [code]
  (case code
    200 "OK"
    400 "Bad Request"
    404 "Not Found"
    "Unknown"))

(defn temperature [temp]
  (cond
    (>= temp 120) "Extremely Hot"
    (>= temp 100) "Hot"
    (>= temp 80) "Mild"
    (>= temp 60) "Cool"
    (>= temp 0) "Cold"
    :else "Frigid"))

;; Iteration with side-effect
(defn iterate-print [count]
  (dotimes [current count]
    (println "Current: " current)))

(defn nested-iterate [arr1 arr2]
  (doseq [a arr1 b arr2]
    (println (* a b))))

;; Iteration without side-effect
(defn list-comprehension [arr1 arr2]
  (for [a arr1 b arr2]
    (* a b)))

;; Exceptions - use for JVM interop
(defn must-more-than-zero [num]
  (if (> num 0)
    (throw (Exception. "something happened"))
    num))

(defn try-catch-finally []
  (try
    (must-more-than-zero 3)
    (catch RuntimeException e "oh no" e)
    (finally (println "always runs")))
  )
