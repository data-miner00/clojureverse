(ns clojureverse.core-test
  (:require [clojure.test :refer :all]
            [clojureverse.core :refer :all]
            [cheshire.core :as cheshire]))

(deftest a-test
  (testing "I Success."
    (is (= 1 1))))

;; Usage of cheshire/generate-string
(deftest cheshire-generate-string-test
  (testing "Stringify map with 2 properties"
    (def person {:name "Sandra" :age 31})
    (is (= (cheshire/generate-string person) "{\"name\":\"Sandra\",\"age\":31}"))))
