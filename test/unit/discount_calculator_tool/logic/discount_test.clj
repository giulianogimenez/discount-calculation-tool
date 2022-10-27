(ns discount-calculator-tool.logic.discount-test
  (:require [clojure.test :refer [deftest are testing]]
            [discount-calculator-tool.logic.discount]))


(deftest discount-test
  (testing "given a value of payment, should have a behavioural for the discount"
    (are [value expected]
       (= expected (discount-calculator-tool.logic.discount/close-bill value))
         99    99
         100   95
         1000  930
         10000 9000)))