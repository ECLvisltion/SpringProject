import { ProjectOptions } from "@vue/cli-service"

export const config: ProjectOptions =
{
  publicPath: process.env.BASE_URL || "/",
  outputDir: "../src/main/resources/static",
  indexPath: "index.html",
  devServer:
  {
    port: 8081,
    proxy: "http://localhost:8081"
  },
  chainWebpack: (config) =>
  {
    const svgRule = config.module.rule("svg");
    svgRule.uses.clear();
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");
  }
};