(ns concepts.collections)

;; List - is a linked list
(def my-list `(1 2 3 4))
(conj my-list 5) ; (5 1 2 3 4)
(peek my-list) ; first item
(pop my-list)
(sort (fn [a b] (- b a)) `(5 3 2 8 19))
; Other functions: into, take list?

;; Vector - indexed (array-like)
(def my-vec [1 2 3 4])
(peek my-vec) ; last item
(pop my-vec)

(get my-vec 0) ; 1
; Other functions: vector? get assoc subvec first rest sort-by

;; Sets
(:require '[clojure.set :as set])
(def my-set #{1 2 3})
(set/union my-set my-set)
; Other function: conj contains? disj union difference intersection subset

;; Maps
(def my-map {:name "Sandra" :age 30})
