(ns concepts.side-effects
  (:require [clojure.java.io]
            [clojure.java.jdbc :as sql]))

;; One-off I/O
(spit "my-file.txt" "Hello world!")
(spit "my-file.txt" "Hello world!" :append true)

(slurp "my-file.txt")
(slurp "my-file.txt" :encoding "UTF-8")

;; Chunk I/O
(with-open [writer (clojure.java.io/writer "file.txt")]
  (doseq [line my-lines]
    (.write writer line)
    (.newLine writer)))

(with-open [reader (clojure.java.io/reader "file.txt")]
      (doseq [line (line-seq reader)]
        (println line)))

;; Database
(def connection-info {:subprotocol "postgresql"
                      :subname "//127.0.0.1:5431/db"
                      :user "postgres"
                      :password ""})

(println (sql/query connection-info
                    ["SELECT * FROM user"]))

(sql/insert!
 connection-info
 :user
 {:uuid (java.util.UUID/randomUUID)
  :name "Wired Brain"
  :kind "French Roast"
  :price 2.99})

(sql/query connection-info["DELETE FROM coffee *"])