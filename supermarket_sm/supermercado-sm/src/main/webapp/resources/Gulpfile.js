let gulp = require('gulp');
let cleanCSS = require('gulp-clean-css');
var compass = require('gulp-compass');
var livereload = require('gulp-livereload');

gulp.task('minify-css',() => {
  return gulp.src(['./css/dev/*.css'])
    .pipe(cleanCSS()) 
    .pipe(gulp.dest('css/public/'))
    .pipe(livereload({
          auto: false
      }));
});
/**
* Preprocess all the css inside the directory ./assets/sass/ and all these subdirectories with compass
* For more information visit:
* @link http://compass-style.org
**/
gulp.task('compass', function() {
      gulp.src([
        './sass/*.scss',
        './sass/layouts/*.scss',
        './sass/**/*.scss',
        './sass/**/**/*.scss',
        './sass/**/**/**/*.scss'
      ])
      .pipe(compass({
        config_file: './config.rb',
        css: './css/dev',
        sass: './sass'
      }))
      .pipe(gulp.dest('./css/dev'))
      .pipe(livereload({
          auto: false
      }));
});
gulp.task('watch', function() {
      gulp.watch([
        './sass/*.scss',
        './sass/layouts/*.scss',
        './sass/**/*.scss',
        './sass/**/**/*.scss',
        './sass/**/**/**/*.scss'
      ], ['compass']);
      gulp.watch('./css/dev/main.css',['minify-css'])
     ;
});
gulp.task('default', ['compass','minify-css','watch'],function(){

});