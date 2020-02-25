
## ClojureScript React Native with ShadowCLJS and Helix

An example live-reloading ClojureScript project that combines:

* [react-native](https://facebook.github.io/react-native/)
* [shadow-cljs](http://shadow-cljs.org/)
* [helix](https://github.com/Lokeh/helix)

**Note:** fast refresh not currently working.

### Setup:

```
$ ( cd react-native && yarn install )
```

### Running:

```
$ make shadow
$ make bundler
$ make ios
```
