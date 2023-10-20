<template>
  <div class="main">
    <img src="../assets/logo.png" alt="Vue logo" />
    <h1>메인 화면</h1>
    <h3>로그인</h3>
    <ul>
      <li class="button">
        <a th:href="@{/signup}" rel="nofollow" class="buttonText">회원 가입</a>
      </li>
      <li class="button">
        <a th:href="@{/signin}" rel="nofollow" class="buttonText">로그인</a>
      </li>
    </ul>
    <h3>Q&A</h3>
    <ul>
      <li class="button">
        <a th:href="@{/question/list}" target="_blank" rel="noopener" class="buttonText">질문 리스트</a>  
      </li>
    </ul>
  </div>
</template>

<script setup lang="ts">

</script>

<style scoped>
h3
{
  margin: 40px 0 0;
}
ul
{
  list-style-type: none;
  padding: 0;
}
li
{
  display: inline-block;
  margin: 0 10px;
}
.button 
{
  position: relative;
  color: #2e805b;
  background-color: #48c68d;
  width: 100px;
  height: 30px;
  outline: 3px solid;
  border-radius: 1rem;
  text-align: center;
}
.buttonText
{
  position: absolute;
  text-align: center;
  display: block;
  left: 50%;
  top: 50%;
  color: #000000;
  transform: translate(-50%, -50%);
  width: 100%;
}
</style>
