

fun main() {


    var Todo = Todo()
    var task1 = Task (1, "Task 1","this is 1")
    var task2 = Task (2, "Task 2","this is 2")
    var task3 = Task (3, "Task 3","this is 3")



    Todo.addTask(task2)

    Todo.showAllTasks()

    Todo.printSpecificTask(id = 5)

    Todo.changeTask(task3)

    Todo.removeTask(task1)


}
data class Task(
    val id: Int,
    val name: String,
    val note: String,
    var isCompleted: Boolean = false
)
class Todo {
    var tasks = arrayListOf<Task>()
    private set


    fun showAllTasks() {
        for (task in tasks) {
            println(task)
        }
    }

    fun printSpecificTask(id: Int) {
        for (task in tasks) {
            if (task.id == id) {
                println("the task is $task")
                return
            }
        }
        println("Task not found")
    }
    fun addTask (task : Task) {
        tasks += task

    }
    fun removeTask (task :Task){
        tasks.remove(task)

    }

    fun changeTask(task: Task) {
        println("Before this fun $task")
        when (task.isCompleted){
            true -> task.isCompleted = false
            false-> task.isCompleted = true}
            println("task after $task")
        }
    }
