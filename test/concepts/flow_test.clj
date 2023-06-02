(ns concepts.flow-test
  (:require [clojure.test :refer :all]
            [concepts.flow :refer :all]))


(deftest odd-or-even-test
  (testing "When number is 3 return odd"
    (is (= (odd-or-even 3) "odd")))
  
  (testing "When number is 4 return even"
    (is (= (odd-or-even 4) "even"))))

(deftest odd-or-even-side-effect-test
  (testing "When number is 3 return odd"
    (is (= (odd-or-even-side-effect 3) "odd")))
  
  (testing "When number is 4 return even"
    (is (= (odd-or-even-side-effect 4) "even"))))

(deftest greet-test
  (testing "When name is given should greet",
    (is (= (greet "Alice") "hello Alice")))
  
  (testing "When no name is provided return nothing"
    (is (= (greet nil) nil))))

(deftest status-test
  (testing "Return OK when 200"
    (is (= (status 200) "OK")))
  
  (testing "Return Bad Request when 400"
    (is (= (status 400) "Bad Request")))
  
  (testing "Return Not Found when 404"
    (is (= (status 404) "Not Found")))
  
  (testing "Return Unknown when not supported"
    (is (= (status 123) "Unknown"))))

(deftest temperature-test
  (testing "Return Extremely Hot when temperature >= 120"
    (is (= (temperature 121) "Extremely Hot")))
  
  (testing "Return Hot when temperature >= 100 < 120"
    (is (= (temperature 101) "Hot")))
  
  (testing "Return Mild when temperature >= 80 < 100"
    (is (= (temperature 81) "Mild")))
  
  (testing "Return Cool when temperature >= 60 < 80"
    (is (= (temperature 61) "Cool")))
  
  (testing "Return Cold when temperature >= 0 < 60"
    (is (= (temperature 1) "Cold")))
  
  (testing "Return Frigid when temperature below 0"
    (is (= (temperature -1) "Frigid"))))

