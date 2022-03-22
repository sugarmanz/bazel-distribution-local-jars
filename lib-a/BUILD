load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@junit//junit5-jupiter-starter-bazel:junit5.bzl", "kt_jvm_junit5_test")
load("@vaticle_bazel_distribution//maven:rules.bzl", "deploy_maven", "assemble_maven")

kt_jvm_library(
    name = "lib-a",
    srcs = ["LibA.kt"],
    visibility = ["//visibility:public"],
    deps = ["//vendor"],
    exports = ["//vendor"],
    tags = ["maven_coordinates=com.sugarmanz.bazel.distribution:lib-a:{pom_version}"],
)

kt_jvm_junit5_test(
    name = "test",
    srcs = ["LibATest.kt"],
    associates = [":lib-a"],
    test_package = "com.sugarmanz.bazel.distribution",
)

assemble_maven(
    name = "assemble",
    target = ":lib-a",
    version_file = "//:VERSION",
    workspace_refs = "@plugin_workspace_refs//:refs.json",
)

deploy_maven(
    name = "deploy",
    target = ":assemble",
    release = "https://release.com",
    snapshot = "https://snapshot.com",
)