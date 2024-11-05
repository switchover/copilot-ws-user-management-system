<template>
  <div>
    <h2>Bulk Course Enrollment</h2>
    <form @submit.prevent="bulkEnrollCourses">
      <div>
        <label for="courseFile">Upload Course File:</label>
        <input type="file" id="courseFile" @change="handleFileUpload" required>
      </div>
      <button type="submit">Enroll Courses</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      courseFile: null
    };
  },
  methods: {
    handleFileUpload(event) {
      this.courseFile = event.target.files[0];
    },
    bulkEnrollCourses() {
      // Add logic to handle bulk course enrollment
      console.log('Bulk course enrollment file:', this.courseFile);
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
</style>
