load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@junit//junit5-jupiter-starter-bazel:junit5.bzl", "kt_jvm_junit5_test")
load("@vaticle_bazel_distribution//maven:rules.bzl", "deploy_maven", "assemble_maven")

kt_jvm_library(
    name = "lib-b",
    srcs = ["LibB.kt"],
    deps = ["//lib-a"],
    visibility = ["//visibility:public"],
    tags = ["maven_coordinates=com.sugarmanz.bazel.distribution:lib-b:{pom_version}"],
)

kt_jvm_junit5_test(
    name = "lib-b-test",
    srcs = ["LibBTest.kt"],
    associates = [":lib-b"],
    test_package = "com.sugarmanz.bazel.distribution",
)

assemble_maven(
    name = "lib-b-assemble",
    target = ":lib-b",
    version_file = "//:VERSION",
    workspace_refs = "@plugin_workspace_refs//:refs.json",
)

deploy_maven(
    name = "lib-b-deploy",
    target = ":lib-b-assemble",
    release = "https://release.com",
    snapshot = "https://snapshot.com",
)