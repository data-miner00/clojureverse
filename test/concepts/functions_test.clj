(ns concepts.functions-test
  (:require [clojure.test :refer :all]
            [concepts.functions :refer :all]))

(deftest prefix-strs-test
  (testing "Passed in the argument, gets prefixed with `prefix-`"
    (is (= (prefix-strs "hello") "prefix-hello"))))

(deftest filter-map-test
  (testing "Given an array of maps, get only the maps that have :value = 3"
    (def my-map [{:name "Alice" :value 1} {:name "Bruce" :value 2} {:name "Camelia" :value 3}])
    (def target-value 3)
    (is (= (filter-maps-by-value my-map target-value) `({:name "Camelia" :value 3})))))

(deftest addition-test
  (testing "Test 1 + 2 = 3"
    (is (= (addition 1 2) 3))))

(deftest get-delimiter-test
  (testing "When no args is passed, expect `you have no args`"
    (is (= (get-delimiter) "you have no args")))

  (testing "When one arg is passed, expect args to be suffixed with `:`"
    (is (= (get-delimiter "hello") "hello:")))

  (testing "When two args is passed, expect args to be delimited with `-`"
    (is (= (get-delimiter "hello" "world") "hello-world")))

  (testing "When three args is passed, expect args to be delimited with `;`"
    (is (= (get-delimiter "hello" "hello" "hello") "hello;hello;hello"))))

(deftest aggregate-counts-test
  (testing "When I pass in [1 2 3], expect sum to be 6"
    (is (= (aggregate-counts 1 2 3) 6)))

  (testing "When I pass in [10 20 30 40 60], expect sum to be 160"
    (is (= (aggregate-counts 10, 20, 30, 40, 60) 160))))


(deftest ackermann-test
  (testing "Ackermann(1, 2) = 4"
    (is (= (ackermann 1 2) 4)))

  (testing "Ackermann(2, 1) = 5"
    (is (= (ackermann 2 1) 5)))

  (testing "Ackermann(2, 2) = 7"
    (is (= (ackermann 2 2) 7))))


(deftest factorial-test
  (testing "6! = 720"
    (is (= (factorial 6) 720))))


(deftest people-in-scenes-test
  (def scenes [{:subject "Frankie"
                :action "say"
                :object "relax"}

               {:subject "Lucy"
                :action "❤s"
                :object "Clojure"}

               {:subject "Rich"
                :action "tries"
                :object "a new conditioner"}])

  (testing "Generate a string with the names of people in scene"
    (is (= (people-in-scenes scenes) "Frankie, Lucy, Rich"))))
