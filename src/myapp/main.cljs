(ns myapp.main
  (:require ["react-native" :as rn]
            [applied-science.js-interop :as j]
            [myapp.util :refer [log]]
            [helix.core :refer [defnc $]]))

(defnc Root [_]
  ($ rn/View {:style #js {:flex 1, :alignItems "center", :justifyContent "center"}}
     ($ rn/Text {:style #js {:fontSize 36}}
        "Hello Helix!")))

(defn start {:dev/after-load true} []
  ;; nothing to do here
  )

(defn init []
  (rn/AppRegistry.registerComponent "MyApp" (fn [] Root))
  (start))
