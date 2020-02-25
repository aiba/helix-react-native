(ns myapp.util
  (:require [applied-science.js-interop :as j]))

;; wrapper for console.log
(defn log [& args]
  (j/apply js/console :log (to-array args)))

;; pretty-print js object to string
(defn jpps [x]
  (j/call js/JSON :stringify x nil 2))
