(ns discount-calculator-tool.logic.discount-test
  (:require [clojure.test :refer [deftest is testing]]
            [discount-calculator-tool.logic.discount]))


(deftest discount-test
  (testing "given a value of payment, should have a behavioural for the discount"
    (is (= [99 95 930 9000]
           (map discount-calculator-tool.logic.discount/calculate [99 100 1000 10000])))))